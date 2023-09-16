class Solution {
    public int dayOfYear(String date) {
        int[] months = {31,28,31,30,31,30,31,31,30,31,30,31};
        int sum = 0;
        String[] d = date.split("-");
        int year = Integer.parseInt(d[0]);
        int month = Integer.parseInt(d[1]);
        int day = Integer.parseInt(d[2]);
        for(int i=0;i<month-1;i++){
            sum+=months[i];
        }
        if(month > 2 && year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))
		{
			day=day+1;
		}
        return sum+day;
    }
}