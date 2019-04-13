import java.lang.reflect.Array;
import java.util.*;

class Interval {
    int start;
    int end;
    Interval() { start = 0; end = 0; }
    Interval(int s, int e) { start = s; end = e; }
}


public class _253_Meeting_Rooms_II {
        public int minMeetingRooms(Interval[] intervals) {
            if(intervals.length == 0) {
                return 0;
            }

            PriorityQueue<Integer>  queue = new PriorityQueue<Integer>(
                    intervals.length,
                    new Comparator<Integer>() {
                @Override
                public int compare(Integer a1, Integer a2) {
                    return a1 - a2;
                }
            });

            Arrays.sort(intervals, new Comparator<Interval>() {
                @Override
                public int compare(Interval a1, Interval a2) {
                    return a1.start - a2.start;
                }
            });

            // add first meeting into queue
            queue.add(intervals[0].end);

            // allocate meeting rooms, replace the existing one if the new meetings starts afterwards
            for(int i = 1; i < intervals.length; i++) {
                if(intervals[i].start >= queue.peek()) {
                    queue.poll();
                }

                queue.add(intervals[i].end);
            }

            return  queue.size();
        }
}
