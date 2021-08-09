class XY{
    static long count(long num) {
        if(num==1) return 1;
        else{
            return num+count(num-1);
        }
    }
    public static void main(String[] args){
        System.out.println(count(5));
    }
}