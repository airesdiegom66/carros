package com.example.carros.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CarroService {

    @Autowired
    private CarroRepository rep;

    public Iterable<Carro> getCarros() {
        return  rep.findAll();
    }

    public Optional<Carro> getCarroById(Long id) {
        return rep.findById(id);
    }

    public Iterable<Carro> getCarroByTipo(String tipo) {
        return rep.findByTipo(tipo);
    }

    public Carro save(Carro carro) {
        return rep.save((carro));
    }

    public Carro update(Carro carro, Long id) {
        Assert.notNull(id, "Não foi possível atualizar o registro");

        //Busca o carro no banco de dados
        Optional<Carro> optional = getCarroById(id);

        if(optional.isPresent()){
            Carro db = optional.get();
            //Copiar as propriedades
            db.setNome(carro.getNome());
            db.setTipo(carro.getTipo());

            //atualiza o carro
            rep.save(db);

            return  db;
        }else {
            //return null;
            throw new RuntimeException("Não foi possível atualizar o registro");
        }
    }

    public void delete(Long id) {
        Optional<Carro> optional = getCarroById(id);

        if(optional.isPresent())
            rep.delete(optional.get());
    }

    public List<Carro> getCarrosFake(){
        List<Carro> carros = new ArrayList<>();

        carros.add(new Carro(1L, "Fusca"));
        carros.add(new Carro(2L,"Scort"));
        carros.add(new Carro(3L,"Caravan"));

        return carros;
    }

}
