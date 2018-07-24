package com.transce.wcl.trade.mapper;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * RpTradePaymentOrderDao
 */
public interface RpTradePaymentOrderMapper <T, PK extends Serializable> {
/**
	 * ��ȡ�ܼ�¼��
	 * @param params map�б��봫��: 
	 * 		model - ��ѯ�����Ķ���<T>
	 * @return
	 */
	public abstract int getTotalCount(Map<String, Object> params);
	
	/**
	 * ��ѯһ�����󼯺�
	 * @param obj ��ѯ�����Ķ���
	 * @return
	 */
	public abstract List<T> findList(T obj);
	
	
	/**
	 * ����������ѯ����
	 * @param obj
	 * @return
	 */
	public abstract int getCountSize(T obj);
	
	
	/**
	 * ��ҳ
	 */
	public abstract List<T> findPageList(Map<String, Object> params);

	/**
	 * ����
	 */
	public abstract int save(T obj);
	
	/**
	 * ����
	 */
	public abstract int update(T obj);

	/**
	 * ɾ��
	 */
	public abstract int delete(PK pk);
	
	/**
	 * ���������Ҷ���
	 */
	public abstract T getById(PK pk); 
}
