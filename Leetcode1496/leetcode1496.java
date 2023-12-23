import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean isPathCrossing(String path) {
    Set<String> points = new HashSet<>();
    for (int i = 0, x = 0, y = 0; i < path.length(); i++) {
        char c = path.charAt(i);
        points.add(x+" "+y);
        if (c == 'N') {
            y += 1;
        }else if (c == 'S') {
            y -= 1;
        }else if (c == 'E') {
            x -= 1;
        }else {
            x += 1;
        }

        if (!points.contains(x +" "+ y)) {
            points.add(x+" "+y);
        }
        else{
            return true;
        }
    }
    return false;
}
}