package ua.workshop.db.DAO;

import java.util.Collection;

/**
 * ����� ������ ��� ���� ��������� �������� � ��������� IGenericDAO
 * @author Pasha
 *
 * @param <T>
 */
public interface IGenericDAO<T> {
	/**
	 * ��������� ����� ������ � ���� ������. 
	 * @param entity ������ ��� ����������
	 */
	public void save(T entity);

	/**
	 * ��������� ������ � ���� ������.  
	 * @param entity ������ ��� ����������
	 */
	public void update(T entity);

	/**
	 * �������� ������� �� ���� ������ 
	 * @param entity ������ ��� ��������
	 */
	public void delete(T entity);   

	/**
	 * ������� ������ �� ��� ����������� �������������� 
	 * @param entityId ���������� ������������� �������
	 * @return ��������� ������ ��� <code>null</code>
	 */
	public T getById(Integer entityId);

	/**
	 * �������� ���������� ������� � ��
	 * @return ���������� ������� � ��
	 */
	public Integer getAllCount(); 

	/**
	 * �������� ��������� ���� �������� 
	 * @return ��������� ���� ��������
	 */
	public Collection<T> getAll(); 
}