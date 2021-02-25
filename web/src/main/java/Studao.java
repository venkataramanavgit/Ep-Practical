import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Studao {
	public int studentDAO(pojo pj) {
		StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();
		
		SessionFactory factory=meta.getSessionFactoryBuilder().build();
		Session session=factory.openSession();
		Transaction t=(Transaction)session.beginTransaction();
		pojo s=new pojo();
		s.setRegno(100);
		s.setName("Chaitanya");
		
		int i=(int) session.save(s);
		t.commit();
		System.out.println("Insertion successful");
		factory.close();
		session.close();
		return i;
		
		
	}

}
