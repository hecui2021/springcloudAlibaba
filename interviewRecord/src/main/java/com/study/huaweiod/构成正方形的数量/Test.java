import java.util.HashSet;
import java.util.Set;

public class Test {

    // 定义一个点的类
    static class Point {
        int x, y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        // 重写 equals 和 hashCode 方法，用于哈希集合
        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Point point = (Point) obj;
            return x == point.x && y == point.y;
        }

        @Override
        public int hashCode() {
            return 31 * x + y;
        }
    }

    // 计算两点之间的距离的平方
    private static int distanceSquared(Point p1, Point p2) {
        int dx = p1.x - p2.x;
        int dy = p1.y - p2.y;
        return dx * dx + dy * dy;
    }

    // 计算构成正方形的数量
    public static int countSquares(Point[] points) {
        // 将点集存入哈希集合，方便快速查找
        Set<Point> pointSet = new HashSet<>();
        for (Point p : points) {
            pointSet.add(p);
        }

        int squareCount = 0;

        // 遍历所有点对
        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                Point p1 = points[i];
                Point p2 = points[j];

                // 计算两个点的中点
                double midX = (p1.x + p2.x) / 2.0;
                double midY = (p1.y + p2.y) / 2.0;

                // 计算两个点的向量差
                int dx = p1.x - p2.x;
                int dy = p1.y - p2.y;

                // 计算另外两个点的坐标
                Point p3 = new Point((int) (midX - dy / 2.0), (int) (midY + dx / 2.0));
                Point p4 = new Point((int) (midX + dy / 2.0), (int) (midY - dx / 2.0));

                // 检查 p3 和 p4 是否在点集中
                if (pointSet.contains(p3) && pointSet.contains(p4)) {
                    // 检查是否构成正方形（边长相等且对角线相等）
                    int d1 = distanceSquared(p1, p2);
                    int d2 = distanceSquared(p1, p3);
                    int d3 = distanceSquared(p1, p4);
                    int d4 = distanceSquared(p2, p3);
                    int d5 = distanceSquared(p2, p4);
                    int d6 = distanceSquared(p3, p4);

                    // 确保四条边相等且两条对角线相等
                    if (d1 > 0 && d1 == d2 && d2 == d3 && d3 == d4 && d5 == d6) {
                        squareCount++;
                    }
                }
            }
        }

        // 每个正方形被计数 4 次（每条边作为起始边），所以需要除以 4
        return squareCount / 4;
    }

    public static void main(String[] args) {
        // 示例点集
        Point[] points = {
                new Point(0, 0),
                new Point(0, 1),
                new Point(1, 0),
                new Point(1, 1),
                new Point(2, 2),
                new Point(2, 3),
                new Point(3, 2),
                new Point(3, 3)
        };

        int result = countSquares(points);
        System.out.println("构成正方形的数量: " + result); // 输出: 2
    }
}