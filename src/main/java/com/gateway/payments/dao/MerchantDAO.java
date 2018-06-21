package com.gateway.payments.dao;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.e4gslab.ebill.payment.gateway.model.Merchant;
import com.e4gslab.ebill.payment.gateway.model.MerchantType;
import com.gateway.payments.repositories.IMerchantRepository;

@Component
//@Transactional("payment-gateway")
public class MerchantDAO {
	
	@Autowired
	IMerchantRepository merchantRepository;
	
	@PersistenceContext(unitName = "ebill-payments-gateway-model")
	private EntityManager em;
	
	private SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
	
	public MerchantDAO() {
		// TODO Auto-generated constructor stub
	}
	
	@SuppressWarnings("unchecked")
	public Merchant getDefaultMerchantByApplicationId(String applicationId) {
		
		StringBuilder sql = new StringBuilder();
		
		Merchant merchant = null;
		MerchantType merchantType = null;
		
		try {
		
			sql.append(" SELECT X.* FROM (");
			sql.append(" SELECT");
			sql.append(" 	M.MERCHANT_ID as M_MERCHANT_ID,"); // 1
			sql.append(" 	M.NAME as M_NAME,"); //2
			sql.append(" 	TO_CHAR(M.CREATED_DATE, 'MM/DD/YYYY HH24:MI:SS') as M_CREATED_DATE, "); //3
			sql.append(" 	TO_CHAR(M.UPDATED_DATE, 'MM/DD/YYYY HH24:MI:SS') as M_UPDATED_DATE,"); //4
			sql.append(" 	M.USERNAME,"); // 4
			sql.append(" 	M.PASSWORD,"); // 5
			sql.append(" 	M.MERCHANT_TYPE_ID as M_MERCHANT_TYPE_ID,"); //6
			sql.append(" 	M.ENABLED as M_ENABLED,"); // 7
			sql.append(" 	M.URL M_URL,"); // 8
			sql.append(" 	MT.NAME as MT_NAME,"); //9
			sql.append(" 	TO_CHAR(MT.CREATED_DATE, 'MM/DD/YYYY HH24:MI:SS') as MT_CREATED_DATE,"); // 10
			sql.append(" 	MT.ENABLED as MT_ENABLED"); // 11
			sql.append(" FROM");
			sql.append(" 	APLICATION A,");
			sql.append(" 	MERCHANT M,");
			sql.append(" 	MERCHANT_TYPE MT,");
			sql.append(" 	APPLICATION_HAS_MERCHANT AHM");
			sql.append(" WHERE");
			sql.append(" 	A.APLICATION_ID = :applicationId ");
			sql.append(" 	AND A.APLICATION_ID = AHM.APPLICATION_ID ");
			sql.append(" 	AND M.MERCHANT_ID = AHM.MERCHANT_ID ");
			sql.append(" 	AND M.ENABLED = 'Y' ");
			sql.append(" 	AND M.MERCHANT_TYPE_ID = MT.MERCHANT_TYPE_ID ");
			sql.append(" 	AND MT.ENABLED = 'Y' ");
			sql.append(" 	) X WHERE ROWNUM = 1 ");
			
			Query q = em.createNativeQuery(sql.toString())
					.setParameter("applicationId", applicationId);
	
			List<Object[]> list = q.getResultList();
			em.close();
			
			// response building-loop
			if (list != null && !list.isEmpty()) {
	
				for (int i = 0; i < list.size(); i++) {
					
					merchant = new Merchant();
					Object[] object = list.get(i);
					
					// merchant instance
					merchant.setMerchantId(object[0] != null ? object[0].toString() : null);
					merchant.setName(object[1] != null ? object[1].toString() : null);
					merchant.setCreatedDate(object[2] != null ? formatter.parse(object[2].toString())  : null);
					merchant.setUpdatedDate(object[3] != null ? formatter.parse(object[3].toString())  : null);
					merchant.setUserName(object[4] != null ? object[4].toString() : null);
					merchant.setPassword(object[5] != null ? object[5].toString() : null);
					merchant.setEnabled(object[7] != null ? object[7].toString() : null);
					merchant.setUrl(object[8] != null ? object[8].toString() : null);
					
					// merchant type instance
					merchantType = new MerchantType();
					merchantType.setName(object[9] != null ? object[9].toString() : null);
					merchantType.setCreatedDate(object[10] != null ? formatter.parse(object[10].toString())  : null);
					merchantType.setEnabled(object[11] != null ? object[11].toString() : null);
					
					// set merchant type
					merchant.setMerchantType(merchantType);
	
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return merchant;
	}	
	
}
