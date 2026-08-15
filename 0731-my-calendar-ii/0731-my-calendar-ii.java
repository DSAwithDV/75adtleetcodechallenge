class MyCalendarTwo {

List<int[]>bookings;
List<int[]>overlaps;

    public MyCalendarTwo() {
        bookings = new ArrayList<>();
        overlaps = new ArrayList<>();
        
    }
    
    public boolean book(int startTime, int endTime) {
        for(int[]overlap:overlaps){
            int overlapStart = overlap[0];
            int overlapEnd = overlap[1];
            if( startTime < overlapEnd && endTime > overlapStart){
                return false;
            }
        }
        for( int[] booking:bookings){
            int bookingStart = booking[0];
            int bookingEnd = booking[1];

            if( startTime < bookingEnd && endTime > bookingStart){
                int overlapStart = Math.max(startTime,bookingStart);
                int overlapEnd = Math.min(endTime,bookingEnd);
                
                overlaps.add(new int[]{overlapStart,overlapEnd});

            }

        }
         bookings.add(new int[]{startTime, endTime});

        return true;
    }
}

/**
 * Your MyCalendarTwo object will be instantiated and called as such:
 * MyCalendarTwo obj = new MyCalendarTwo();
 * boolean param_1 = obj.book(startTime,endTime);
 */