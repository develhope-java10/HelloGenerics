public  class  Converter <S,T>{

    private S s;
    private T t;

    public Converter (S s, T t){
        this.s=s;
        this.t=t;

    }

    public S getS() {
        return s;
    }

    public void setS(S s) {
        this.s = s;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}

