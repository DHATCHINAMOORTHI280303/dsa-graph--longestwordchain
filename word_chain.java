import java.util.*;
class soln{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size : ");

        int n=sc.nextInt();
        String arr[]=new String[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.next();
        }
        int max=0;
        ArrayList<String>finallist=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            char c = arr[i].charAt(arr[i].length()-1);
            ArrayList<String>a=new ArrayList<>();
            a.add(arr[i]);
            boolean state=true;
            int count=0;
            while(state){
                
            for(int j=0;j<arr.length;j++){
                
                if(i!=j){
                    if(arr[j].charAt(0)== c){
                        if(!a.contains(arr[j])){
                        a.add(arr[j]);
                        count++;
                        state=true;
                        c=arr[j].charAt(arr[j].length()-1);
                        break;
                        }

                    }
                }
                state=false;
                
            }
            }
            if(max<=count){
                max=count;
                finallist = a;
            }
        }
        System.out.println();
        System.out.println("longest word chain : ");

        for(String s:finallist ){
            System.out.println(s);
        }

        



    }
}