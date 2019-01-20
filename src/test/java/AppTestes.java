import br.com.desafio.CaixaEletronico;
import br.com.desafio.Nota;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class AppTestes {
    @Test
    public void TestaComInput80() throws  Exception{
        CaixaEletronico caixa = new CaixaEletronico();
        List<Nota> notas = caixa.sacar(80);
        Nota r = notas.get(0);

        Assert.assertEquals(50, r.getValorNota());
        r = notas.get(1);
        Assert.assertEquals(20, r.getValorNota());
        r = notas.get(2);
        Assert.assertEquals(10, r.getValorNota());
    }

    @Test
    public void TestaComInput30() throws  Exception{
        CaixaEletronico caixa = new CaixaEletronico();
        List<Nota> notas = caixa.sacar(30);
        Nota r = notas.get(0);

        Assert.assertEquals(20, r.getValorNota());
        r = notas.get(1);
        Assert.assertEquals(10, r.getValorNota());
    }


    @Test
    public void TestaComInput250() throws  Exception{
        CaixaEletronico caixa = new CaixaEletronico();
        List<Nota> notas = caixa.sacar(30);
        Nota r = notas.get(0);

        Assert.assertEquals(20, r.getValorNota());
        r = notas.get(1);
        Assert.assertEquals(10, r.getValorNota());
    }

    @Test(expected = Exception.class)
    public void TestaComInputInvalido () throws  Exception{
        CaixaEletronico caixa = new CaixaEletronico();
        List<Nota> notas = caixa.sacar(12);
    }
}
