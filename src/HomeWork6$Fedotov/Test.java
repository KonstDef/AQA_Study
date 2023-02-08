package HomeWork6$Fedotov;

public class Test {
    public static void main(String[] args) {
        try{
            Shop shop = new Shop();
            Good good;

            //Zero shop tests
            //remove - negative
            test("Negative removal: ",!shop.remove("ABC"));
            //edit - negative
            good = new Good("A13","ABC",0.123);
            test("Negative edit: ",!shop.edit(good));
            //return + print - negative
            test("Negative print: ",!Runner.print(shop.show("fedsd")));
            //adding - positive
            test("Positive add: ",shop.add(good));

            //Shop with product tests
            //adding - negative
            good = new Good("A13","ACB",0.123);
            test("Negative add: ",!shop.add(good));
            //edit - positive
            Good good2= new Good("A13","ABCD",3.3);
            test("Positive edit: ",shop.edit(good2));
            //edit - negative
            Good good3= new Good("A12","ABC",0.123);
            test("Negative edit: ",!shop.edit(good3));
            //return + print - positive
            test("Positive print: ",Runner.print(shop.show("id")));
            //remove - negative2
            test("Negative removal: ",!shop.remove("A12"));
            //remove - positive
            test("Positive removal: ",shop.remove("A13"));

        }catch(Exception exception){
            System.out.println("Framework exception: " + exception);
        } finally {
            try{
                if(checksNum==0) throw new ArithmeticException();
                System.out.printf("\n\t_____________Results_____________\nResults: %d of %d passed (%.2f%%)",checksPos,checksNum,((double)checksPos/checksNum)*100.0);
            } catch (ArithmeticException arithmeticException){
                System.out.println("Framework test failed!");
            }
        }
    }
    private static int checksNum,checksPos;
    private static void test(String s,boolean b){
        System.out.println((b?"\u2713":"\u2717")+"   "+s+" was "+(b?"": "not ")+"successful!\n");
        checksNum++;
        if(b) checksPos++;
    }
}