package model.entities;

public class DomainExceptions  extends  RuntimeException{
    private  static  final long serialVersionUID = 1l;

    public DomainExceptions(String msg){
        super(msg);
    }
}
