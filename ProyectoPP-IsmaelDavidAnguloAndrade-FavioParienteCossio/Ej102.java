import java.util.ArrayList;
public class Ej102{
    char[][] mat ; 
    public Ej102(){
        mat=new char[][]{{'o','o','o','o','o','o','o','o','o','o','o','o','o','o'},
                         {'o','o','o','o','o','o','L','L','o','o','o','o','L','0'},
                         {'L','L','o','o','o','o','L','L','o','o','o','o','L','0'},
                         {'o','o','o','o','o','L','L','o','o','o','o','o','o','o'},
                         {'o','o','o','o','o','o','o','o','o','o','o','o','o','o'}};  
    }
    private ArrayList<Posicion> posicionesParaPollitos(){
        return getPosicione(mat,5);
    }
    private ArrayList<Posicion> getPosiciones(char[][] mat,int numPollitos){
        ArrayList<Posicion> res = new ArrayList<>();
        boolean b = false;
        int i=0;
        while(i<mat.length&&!b){
            int j=0;
            while(j<mat[0].length&&!b){
                if(mat[i][j]=='L'){
                    res = getPosiciones(mat,numPollitos+1,i,j,new ArrayList<>());
                    if(res.size()==numPollitos+1){
                        b=true;
                    }
                }
                j+=1;
            }  
            i+=1;
        }
        return res;
    }
    private ArrayList<Posicion> getPosicione(char[][] mat,int numPollitos){
        return getPosiciones(mat,numPollitos+1,0,new ArrayList<>(),false);
    }
    private ArrayList<Posicion> getPosiciones(char[][] mat,int max,int i,ArrayList<Posicion> res,boolean b){
        if(i<mat.length&&!b){
            res = getPosiciones(mat,max,i,0,new ArrayList<>(),b);
            if(res.size()!=max)
            if(i<mat.length)
            res = getPosiciones(mat,max,i+1,new ArrayList<>(),b);
        }   
        return res;
    }
    private ArrayList<Posicion> getPosiciones(char[][] mat,int max,int i,int j,ArrayList<Posicion> res,boolean b){
        if(j<mat[0].length&&!b){
            if(mat[i][j]=='L') 
            res = getPosiciones(mat,max,i,j,new ArrayList<>());
            if(res.size()!=max)
            if(j<mat[0].length)
            res = getPosiciones(mat,max,i,j+1,new ArrayList<>(),b);
        }   
        return res;
    }
    private ArrayList<Posicion> getPosiciones(char[][] mat,int max,int i,int j,ArrayList<Posicion> res){
        if(res.size()!=max){
            if(valido(i,j,mat)){   
                if(mat[i][j]=='L'){
                    mat[i][j]='0';
                    Posicion p = new Posicion("fila"+(i+1),j+1);
                    res.add(p);
                    if(res.size()<max){
                        res = getPosiciones(mat,max,i-1,j,res);
                        if(res.size()<max){
                            res = getPosiciones(mat,max,i,j+1,res);
                            if(res.size()<max){
                                res = getPosiciones(mat,max,i+1,j,res);
                                if(res.size()<max){
                                    res = getPosiciones(mat,max,i,j-1,res);
                                    if(res.size()!=max){
                                        res.clear();   
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }  
        return res;
    }
    private boolean valido(int x,int y,char[][] mat){
        return (x>=0&&y>=0&&x<mat.length&&y<mat[0].length);
    }
}