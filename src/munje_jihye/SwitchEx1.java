package munje_jihye;

public class SwitchEx1 {
    public static void main(String[] args) {



        int grade = 2;
        int coupon;

//        if(grade == 1){
//            coupon = 1000;
//        } else if (grade == 2 ) {
//            coupon = 2000;
//        } else if (grade == 3) {
//            coupon = 3000;
//        }else {
//            coupon = 500;
//        }
//
//        System.out.println("발급받은 쿠폰 " +  coupon);

        switch (grade){
            case 1:
                coupon = 1000;
                break;
            case 2:
                coupon = 2000;
                break;
            case 3:
                coupon = 3000;
                break;
            default:
                coupon = 500;
        }

        System.out.println("발급받은 쿠폰 " +  coupon);

        int age = 19;
        String status = (age > 19)?"성인":"미성년자";
        System.out.println("age= " + age + " status= " + status);
    }
}
