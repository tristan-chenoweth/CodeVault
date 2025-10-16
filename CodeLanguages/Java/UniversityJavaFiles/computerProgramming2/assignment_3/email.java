public class email
{
	public static void main (String [] args)
	{
		email e1 = new email();
		System.out.println("Email 1: ");
		System.out.println();
		System.out.println(e1.to_string());
		System.out.println(e1.to_anti_spam_string());

		System.out.println();

		email e2 = new email("abc12340", "website");
		System.out.println("Email 2: ");
		System.out.println();
		System.out.println(e2.to_string());
		System.out.println(e2.to_anti_spam_string());
	}
	// Attributes

	String local;
	String domain;

	// Constructors

	email()
	{
		local = "johndoe";
		domain = "example";
	}

	email(String local_in, String domain_in)
	{
		local = local_in;
		domain = domain_in;
	}

	// Operations

	public String to_string()
	{
		return local + "@" + domain + ".com";
	}

	public String to_anti_spam_string()
	{
		return local + " at " + domain + " dot com";
	}

	public void set_local(String local_set)
	{
		local = local_set;
	}

	public String get_local()
	{
		return local;
	}

	public void set_domain(String domain_set)
	{
		domain = domain_set;
	}

	public String get_domain()
	{
		return domain;
	}
}