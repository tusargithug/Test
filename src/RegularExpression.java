import java.util.UUID;

public class RegularExpression {
    public static void main(String[] args) {
        String staringExpression = "C_";
        String orderNo = UUID.randomUUID().toString();
            orderNo=staringExpression + UUID.randomUUID().toString().replaceAll("[^0-9]", "").substring(0, 8);
            System.out.println("Order No ======>"+orderNo);
        System.out.println(UUID.randomUUID().toString());
        }
    }

