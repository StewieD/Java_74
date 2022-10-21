package DAO;

public interface DAOinterface<T> {
	public T  fillInFo();
	public void checEmpty();
	public void size();
	public void clean();
	public void check(T t);
	public void delete(T t);
	public void checkByName(T t);
	public void printPointHightoLow(T t);
}
