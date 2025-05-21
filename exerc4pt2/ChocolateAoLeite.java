public class ChocolateAoLeite extends Chocolate {
    private String tipoLeite;
 
    public ChocolateAoLeite(String nome, int porcentagemCacau, double peso, String tipoLeite) {
        super(nome, porcentagemCacau, peso);
        this.tipoLeite = tipoLeite;
    }
 


    public String getTipoLeite() {
        return tipoLeite;
    }
    public void setTipoLeite(String tipoLeite) {
        this.tipoLeite = tipoLeite;
    }
 


    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Tipo de Leite: " + tipoLeite);
    }
 
    //Sobrecargaaaaaaaa
    public void exibirInformacoes(boolean detalhado) {
        if (detalhado) {
            exibirInformacoes();
            System.out.println("Processo de fabricação: Mistura de leite " + tipoLeite + " com cacau.");
            System.out.println("Ingredientes especiais: Leite " + tipoLeite + ", açúcar, cacau.");
        } else {
            exibirInformacoes();
        }
    }
}