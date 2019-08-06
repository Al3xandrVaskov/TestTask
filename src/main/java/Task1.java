import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {

    private String ip1;
    private String ip2;

    public Task1(String ip1,String ip2) {
        this.ip1 = ip1;
        this.ip2 = ip2;
    }

    public ArrayList<String> printAndCheckRange() {

        if (ip1 == null || ip2 == null) {
            System.out.println("Введите ip.");
            return null;
        }
        Pattern pattern = Pattern.compile("^\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}$");
        Matcher matcher = pattern.matcher(ip1);

        if (!ip1.equals("")|| !ip2.equals("")) {
            if (!matcher.find()) {
                System.out.println("Введите ip from");
                return null;
            }

            matcher = pattern.matcher(ip2);
            if (!matcher.find()) {
                System.out.println("Введите ip to");
                return null;
            }
        } else {
            System.out.println("Введите ip");
            return null;
        }

        if(ip1.equals(ip2)) {
            System.out.println("ip равны");
            return null;
        }


        long sumIp1 = addressRepresentationToAddress(ip1);
        long sumIp2 = addressRepresentationToAddress(ip2);
        if (sumIp1 > sumIp2) {
            long tempRange = sumIp2;
            sumIp2 = sumIp1;
            sumIp1 = tempRange;
        }
        ArrayList<String> finalList = new ArrayList<>();
        for (int i = 1; i < sumIp2 - sumIp1; i++) {
            long sumCurrent = sumIp1 + i;
            System.out.println(addressToAddressRepresentation(sumCurrent));
            finalList.add(addressToAddressRepresentation(sumCurrent));
        }
        return finalList;
    }

    private long addressRepresentationToAddress(String addressRep) {
        long result = 0L;
        String[] tokens = addressRep.split("\\.");

        for (int i = 0; i < 4; i++) {

            result += Math.pow(256, i) * Long.parseLong(tokens[3-i]);
        }

        return result;
    }

    private String addressToAddressRepresentation(long address) {
        String result = String.valueOf(address % 256);

        for (int i = 1; i < 4; i++) {
            address = address / 256;
            result = (address % 256) + "." + result;
        }

        return result;
    }


}
