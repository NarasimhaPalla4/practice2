import java.util.*;
public class Salary {
    public static void main(String[] args) {
        int i,sum=0,s1=0;
        int[] a;
        a= new int[8];
        Scanner s = new Scanner(System.in);
        for(i=0;i<7;i++) {
            a[i] = s.nextInt();
            s1+=a[i];
        }
        if(s1<=40) {
            for (i = 0; i < 7; i++) {
                if (a[i] <= 8) {
                    sum += a[i] * 100;
                    if(i==0){
                        sum+=(0.25)*(a[i] * 100);
                    }
                    if(i==6){
                        sum+=(0.5)*(a[i] * 100);
                    }
                } else {
                    sum += a[i] * 100 + (a[i] - 8) * 15;
                    if(i==0){
                        sum+= (0.25)*(a[i] * 100 + (a[i] - 8) * 15);
                    }
                    if(i==6){
                        sum+= (0.5)*(a[i] * 100 + (a[i] - 8) * 15);
                    }

                }
            }

        }
        else{
            for (i = 0; i < 7; i++) {
                sum+=(s1-40)*25;
                if (a[i] <= 8) {
                    sum += a[i] * 100;
                } else {
                    sum += a[i] * 100 + (a[i] - 8) * 15;
                }
            }
        }
        System.out.println(sum);
        }

    }
