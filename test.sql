 select * from Resolucao resolucao0_ 
    left outer join
        Prova prova1_ 
            on resolucao0_.prova_id=prova1_.id 
    left outer join
        Questao questoes2_ 
            on prova1_.id=questoes2_.prova_id 
    left outer join
        Resposta respostas3_ 
            on resolucao0_.id=respostas3_.resolucao_id 
    left outer join
        Questao questao4_ 
            on respostas3_.questao_id=questao4_.id 
    where
        resolucao0_.id=?