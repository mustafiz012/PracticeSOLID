class Rect {
    double width;
    double height;
}

class Square extends Rect {

}

class LSPTester {
    double calculateArea(Rect r) {
        return r.width * r.height;
    }
}
