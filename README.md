# Projeto 
- Clean Architecture

1 - Montar infra
- 1.1 Criar pasta controller para os endpoints
- 1.2 Criar pasta gateways para as interações JPA, entrada e saida para JPA e API
- 1.3 Criar pasta persistence para anotacoes de entidade do banco e extends JPA

2 - Montar domain
- Criar pastas com os modelos de entrada e saida (record dto) do endpoint

3 - Montar application
- 3.1 Criar pasta usecases para as chamadas de serviço e negocio para enviar aos repositorios
- 3.2 Criar pasta gateways para as interfaces do repositorio acima

4 - Montar config
- 4.1 Criar @Bean para as interações de cada class, @Configuration

# Fluxo
- Postman dispara endpoint para infra.controller 1.1
- Chama o application.usecases 3.1 para enviar para o repositorio(interface) application.gateways 3.2
- Mapear em infra.gateways 1.2 as interfaces do application.gateways 3.2 para comunicar com a JPA 
- Mapear o novo importe (se necessario) do controler em config 4.1 
- Ir em infra.gateways para reescrver o metodo
