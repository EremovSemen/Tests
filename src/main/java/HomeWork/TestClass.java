package HomeWork;

public class TestClass {

    @BeforeSuite
   static void before() {
        System.out.println("Before");
    }

    @AfterSuite
    void After() {
        System.out.println("After");
    }

   @Test(order = 3)
    void testMethod() {
       System.out.println("order 3");
   }

   @Test
    void testDefaultOrder() {
       System.out.println("def order");
   }
   @Test(order = 10)
    void testOrder() {
       System.out.println("ord 10");
   }
}
