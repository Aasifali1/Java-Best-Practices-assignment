#  Java Best Practices assignment


1. The code snippet below, can throw a NullPointer exception. Give reason how it can throw a null pointer exception and what would be the best practice to avoid null pointer exception for such cases.                                                                                                                                                       ( 5)

   	public static void main() {
                               
   		private  String compareStringValues(String value) {

   			if(value.equals(“MOM”))
   				return “MOM”;
   			else
   				return “DAD”;
                }
              System.out.println(compareStringValues(“MOM”) + “cook food for me”);
            }
>
2. Code to iterate over a list of string and get only non-empty and non-null string is given below:	                                                                                                                                                                   (5)


                 public static void main(String[] args) {

        		         List<String> collection = new ArrayList<>(
                                                    Arrays.asList("A", null, "B", null, "C", "", "D"));
 
                                         Iterator<String> i = collection.iterator();
                                        while (i.hasNext()) {
                                        String s = i.next();
                                        if (s == null || s.isEmpty()) {
                                                    i.remove();
                                             }
                           }
 
               System.out.println(collection);
           }
    Instead of using for loop or while loop use stream API and do it in a functional way.


3. When can a Java class be marked as final? What does it mean when a class is marked as final?											(5)
>
4. There is a function called processOrder which takes 6 parameters. Is it a good practice? If not, give the reason and what would be the best practice to follow?			(5)

    * processOrder(String customerCode, String CustomerName, String deliveryAddress,BigDecimal unitPrice, int quantity, BigDecimal discountPercentage)
>
5. What is the correct way to check empty strings according to you and why?		5
````
    public boolean isEmpty(String str) {
    return “”.equals(str);
    }
    
    public boolean isEmpty(String str) {
    return str.length == 0;
    }
     
````
>
6.  In the below code snippet, there is a security concern. Identify it and give reason.	5
````
    public static void main() {
                               
	private  boolean authenticate(User user) {
 
		LOGGER.info(“authenticate user {}”, user)
                                                           
                        return “User1”.equals(user.getUserName) &&  “checkPass”.equals(user.getPass));	
			
                 }
       }
````
>
7.  The below code snippet results OutOfMemory or reason for memory leak in the application. Give reason Provide the best solution to avoid memory leak for such cases.			(10)

````
public void readStream()
throws IOException, URISyntaxException {

    String str = "";
    URLConnection conn 
      = new URL("https://blog.knoldus.com/").openConnection();
    BufferedReader br = new BufferedReader(
      new InputStreamReader(conn.getInputStream(), StandardCharsets.UTF_8));
   
    while (br.readLine() != null) {
        str += br.readLine();
    } 
}
````
>
8. Can we catch Throwable? Is it recommended or best practice to catch Throwable? If not, give a  valid reason with an example.
   (10)
````
   public void catchThrowable() {

   try {
   //do Somthing
   } catch(Throwable t) {
   //do somthing
   }
}
````
>
9. Write a program in Java to Print characters and their frequencies of a string  in order of occurrence.                                                                                                                                                                      25

   Input: programming
   Output:  p1r2o1g2a1m2i1n1
    * Note- a)  Use efficient or best suited  Java Collection framework interfaces and classes.
    * b) Use functional programming  means avoid use of for, while, do while loop.
>
10. Write a program in Java to implement a simple dictionary with few letters/strings and print it in alphabetical order.	                                                                                             25
    Note-
    *  a)  Use efficient or best suited  Java Collection framework interfaces and classes.
    *  b) Use functional programming  means avoid use of for, while, do while loop.
