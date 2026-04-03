class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        double[][] cars = new double[n][2];
        for(int i=0;i<n;i++){
            cars[i][0] = (double)position[i];
            cars[i][1] = (double)(target - position[i])/speed[i];
        }
        Stack<Double> stack = new Stack<>();
        Arrays.sort(cars, (a,b)-> Double.compare(b[0],a[0]));
        for(double[] car: cars){
            double currTime = car[1];
            stack.push(currTime);

            if(stack.size()>=2){
                double backCar = stack.pop();
                double frontCar = stack.peek();
                if(backCar > frontCar){
                    stack.push(backCar);
                }
            }
        }
        return stack.size();
    }
}