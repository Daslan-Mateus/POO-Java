import java.util.ArrayList;

public class PessoaDao {
  
  private  ArrayList<Pessoa> list = new ArrayList<>();

  public PessoaDao(){}

  public Pessoa getByid(int id){
    for (int i = 0; i < list.size(); i++) {
      if(id == list.get(i).getId()){
        return list.get(i);

      }
    }
    return null;
  }


  public ArrayList<Pessoa> getAll() {
    return list;
  
  }

   public void adicionar(Pessoa p) {
    list.add(p);
  }

  public void remover(Pessoa p) {
    for (int i = 0; i < list.size(); i++) {
      if(p.getId() == list.get(i).getId()){
        list.remove(i);
      }
    }
  }
    
  }
  

