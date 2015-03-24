package org.hrl.eLearning.dao;

public interface IBaseDao<T> {
	/***
	 * 新增一个对象
	 * @param t
	 * @return
	 */
	public T add(T t);
	/***
	 * 更新一个对象
	 * @param t
	 */
	public void update(T t);
	/***
	 * 根据id删除一个对象
	 * @param id
	 */
	public void delete(Integer id);
	/***
	 * 根据Id查询对象
	 * @param id
	 * @return
	 */
	public T select(Integer id);
}
