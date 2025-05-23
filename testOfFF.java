import java.util.Arrays;
import java.util.TreeSet;
import oc.*;
import display.*;

public class testOfFF {
    public static boolean check(double x,double y,int[][] map){
        int ibx=(int)Math.round(x);
        int iby=(int)Math.round(y);
        if(map[iby][ibx]==1&&Math.abs(x-ibx)<0.4&&Math.abs(y-iby)<0.4){return true;}
        return false;
    }
    public static void main(String[] args) {
        int scaner_y = 0x7fff, scaner_x = 0x3fff8000;
        int MAX = 0x7fffffff;
        int[][] map = {
            {2,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,1,0,0,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {1,0,1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,1,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,1,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,1,1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,1,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,1,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,1,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,1,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,1,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,1,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,0,0,1,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,1,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {1,1,1,1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,1,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,1,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,1,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1,1,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,1,0,0,0,0,1,0,0,0,0,0,0,0,0,1,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,1,0,0,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,1,1,1,1,1,1,0,0,0,0,0,0,0,1,0,1,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,1,0,1,0,1,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,1,0,1,0,0,1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,9},
        };
        int[][] map1={
            { 2, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1 },
            { 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0 },
            { 0, 0, 1, 1, 0, 1, 1, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0 },
            { 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0 },
            { 0, 0, 1, 0, 1, 1, 1, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 0, 1 },
            { 0, 0, 1, 1, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1 },
            { 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 1 },
            { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 1 },
            { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 9 }
    };
        int begin_x = 0, begin_y = 0;
        int[][] BFSmap = new int[map.length][map[0].length];
        for (int[] row : BFSmap) {
            Arrays.fill(row, 0x7fffffff);
        }
        int xLen = map.length, yLen = map[0].length;
        TreeSet<Integer> thisDepth = new TreeSet<>();
        TreeSet<Integer> nextDepth = new TreeSet<>();
        thisDepth.add((xLen-1) << 15 | (yLen-1));
        int depth = 0;
        
        while (!thisDepth.isEmpty()) {// 初始化深度表
            for (Integer location : thisDepth) {
                int x = (location & scaner_x) >> 15;
                int y = location & scaner_y;
                BFSmap[x][y] = depth;
                if (x + 1 < xLen && map[x + 1][y] != 1 && BFSmap[x + 1][y] > depth) {
                    nextDepth.add((x + 1) << 15 | y);
                }
                if (x - 1 >= 0 && map[x - 1][y] != 1 && BFSmap[x - 1][y] > depth) {
                    nextDepth.add((x - 1) << 15 | y);
                }
                if (y + 1 < yLen && map[x][y + 1] != 1 && BFSmap[x][y + 1] > depth) {
                    nextDepth.add(x << 15 | (y + 1));
                }
                if (y - 1 >= 0 && map[x][y - 1] != 1 && BFSmap[x][y - 1] > depth) {
                    nextDepth.add(x << 15 | (y - 1));
                }
            }
            thisDepth = nextDepth;
            nextDepth = new TreeSet<>();
            depth++;
        }
        System.out.println("Depth Map loaded");
        for (int[] row : BFSmap) {
            for(int i=0;i<row.length;i++){
                System.out.print(row[i]+" ");
            }
            System.out.print("\n");
        }
        byte[][] arrowMap = new byte[xLen][yLen];
        for (int i = 0; i < xLen; i++) {// 初始化矢量图
            for (int j = 0; j < yLen; j++) {
                if (map[i][j]==1) {
                    arrowMap[i][j]=17;
                    continue;
                }
                int leftBound = i - 1 >= 0 ? i - 1 : 0;
                int rightBound = i + 1 <= xLen - 1 ? i + 1 : xLen - 1;
                int upperBound = j - 1 >= 0 ? j - 1 : 0;
                int lowerBound = j + 1 <= yLen - 1 ? j + 1 : yLen - 1;
                int nowMinDis = BFSmap[i][j], arrow = 17;
                for (int m = leftBound; m <= rightBound; m++) {
                    for (int n = upperBound; n <= lowerBound; n++) {
                        if (BFSmap[m][n] < nowMinDis) {
                            if (map[m][j]!=1||map[i][n]!=1) {
                                arrow = ((1 + (m - i)) << 4) | (1 + (n - j));
                                if (i==0&&j==0) {
                                    System.out.println((m-i)+" , "+(n-j));
                                }
                                nowMinDis = BFSmap[m][n];
                            }
                        }
                    }
                }
                arrowMap[i][j] = (byte) arrow;
            }
        }
        for (byte[] row : arrowMap) {//打印矢量图
            /*0 1 2 | 0 16 32 左中右 上中下 */
            for(int i=0;i<row.length;i++){
                switch (row[i]) {
                    case 0:
                        System.out.print("NW ");
                        break;
                    case 1:
                        System.out.print("N  ");
                        break;
                    case 2:
                        System.out.print("NE ");
                        break;
                    case 16:
                        System.out.print("W  ");
                        break;
                    case 17:
                        System.out.print("*  ");
                        break;
                    case 18:
                        System.out.print("E  ");
                        break;
                    case 32:
                        System.out.print("SW ");
                        break;
                    case 33:
                        System.out.print("S  ");
                        break;
                    case 34:
                        System.out.print("SE ");
                        break;
                    default:
                        System.out.print(row[i]+" ");
                        break;
                }
            }
            System.out.print("\n");
        }
        System.out.println("arrow map loaded");
        // System.out.println("1,2 location is: "+ map[1][2]);
        double x = 0, y = 0;
        int xx = 0, yy = 0;
        double move_x=0,move_y=0;
        double wayPointX=0,wayPointY=0;
        boolean tyx=true,tyy=true;//x是否>wayPointx
        while (map[xx][yy]!=9) {
            if (move_x==0||move_y==0) {//走到不走了就重新规划路线
                int dvx = ((arrowMap[xx][yy] >> 4 )& 0xf) - 1, dvy = (arrowMap[xx][yy] & 0xf) - 1;
                double vx=dvx*0.95,vy=dvy*0.95;
                move_x=vx;move_y=vy;
                double prex=x+vx,prey=y+vy;
                wayPointX=prex;wayPointY=prey;
                while (ObstacleChecker2.nocade(x,y,prex,prey,map)
                &&prex>0&&prex<xLen&&y>0&&prey<yLen&&(dvx!=0||dvy!=0)) {
                    move_x=vx;move_y=vy;
                    wayPointX=prex;wayPointY=prey;
                    dvx = ((arrowMap[(int)prex][(int)prey] >> 4 )& 0xf) - 1;
                    dvy = (arrowMap[(int)prex][(int)prey]& 0xf) - 1;
                    vx+=dvx*0.95;vy+=dvy*0.95;
                    prex=x+vx;prey=y+vy;
                    // System.out.println("checker");
                }    
                double theLen=Math.sqrt(move_x*move_x+move_y*move_y);
                // System.out.println("moveX: "+move_x+" moveY: "+move_y);
                // System.out.println("theLen: "+theLen);
                if(wayPointX<0){wayPointX+=0.5;}
                if(wayPointX>xLen){wayPointX-=0.5;}
                if(wayPointY<0){wayPointY+=0.5;}
                if(wayPointY>yLen){wayPointY-=0.5;}
                move_x/=theLen;move_y/=theLen;
                tyx=x>wayPointX;tyy=y>wayPointY;
            }
            // System.out.println("the movement at this place: " + move_x + " " + move_y);
            //默认速度为1，move_x和move_y没有乘倍率
            double newx=x + 0.02 * move_x;
            double newy=y + 0.02 * move_y;
            if (map[(int)newx][yy]!=1) {x=newx;}
            else{move_x=0;}
            if (map[xx][(int)newy]!=1) {y=newy;}
            else{move_y=0;}
            // System.out.println("now location: "+x + " " + y);
            DisplayUtil2.display(map, x, y);
            if (x>wayPointX!=tyx&&y>wayPointY!=tyy) {
                move_x=0;move_y=0;
            }
            xx=(int)x;yy=(int)y;
            try {
                Thread.sleep(5);//50帧
            } catch (InterruptedException e) {
                // 处理中断异常（当线程在睡眠时被其他线程中断）
                Thread.currentThread().interrupt(); // 恢复中断状态
                e.printStackTrace();
            }
        }
        System.out.println("arrive");
        System.out.println(xx + " " + yy);
        System.out.println(map[xx][yy]);
    }
}