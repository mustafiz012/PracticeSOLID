//Below implementations are violating Interface segregation principle

interface OnWrongClickListener {
    void onClicked();

    void onLongClicked();
}

class WrongImpl implements OnWrongClickListener {

    @Override
    public void onClicked() {
        System.out.println("I just this need/depend on this method");
    }

    @Override
    public void onLongClicked() {
        System.out.println("This method is not necessary for me but I must override it to use the interface which violates the principle");
    }
}


//Below implementations are not violating Interface segregation principle

interface OnClickListener {
    void onClicked();
}

interface OnLongClickLister extends OnClickListener {
    void onLongClicked();
}

interface OnTripleClickListener extends OnLongClickLister {
    void onDoubleClicked();
}


class A implements OnClickListener {

    @Override
    public void onClicked() {

    }
}

class B implements OnLongClickLister {

    @Override
    public void onClicked() {

    }

    @Override
    public void onLongClicked() {

    }
}

class C implements OnTripleClickListener {

    @Override
    public void onClicked() {

    }

    @Override
    public void onLongClicked() {

    }

    @Override
    public void onDoubleClicked() {

    }
}