package com.ccb.dp.nosql.client;

import java.util.List;

/**
 * nsqlmap组件客户操作接口
 * @author Administrator
 *
 */
public interface NsqlMapClient {

	List<?> findList(String id, final Object parameterObject) throws NsqlMapException;
	List<?> findList(String id, final Object parameterObject, String consistencyLevel) throws NsqlMapException;
	Object findObject(String id, final Object parameterObject) throws NsqlMapException;
	Object findObject(String id, final Object parameterObject, String consistencyLevel) throws NsqlMapException;
	Boolean update(final String id, final Object parameterObject) throws NsqlMapException;
	Boolean update(final String id, final Object parameterObject, String consistencyLevel) throws NsqlMapException;
	void delete(final String id, final Object parameterObject) throws NsqlMapException;
	void delete(final String id, final Object parameterObject, String consistencyLevel) throws NsqlMapException;
	Boolean insert(final String id, final Object parameterObject) throws NsqlMapException;
	Boolean insert(final String id, final Object parameterObject, String consistencyLevel) throws NsqlMapException;
	void batchInsert(final String id, final Object parameterObject) throws NsqlMapException;
	void batchInsert(final String id, final Object parameterObject, String consistencyLevel) throws NsqlMapException;
}
