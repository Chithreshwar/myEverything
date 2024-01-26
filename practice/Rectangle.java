package practice;

public class Rectangle {
    Point topLeft;
    int length;
    int width;

    int getArea(){
        return this.length*this.width;
    }
    int getPerimeter(){
        return 2*(this.width + this.length);
    }

    Point getBottomRight(){
        Point ans = new Point();
        ans.x = this.topLeft.x + this.width;
        ans.y = this.topLeft.y - this.length;

        return ans;
    }
}
