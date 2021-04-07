*Atividade para treinar uso de layouts*

Especificação:
"Em um projeto Android, utilizando os layouts para organização dos componentes visuais da
interface de usuário implemente uma tela para lançamento de horas trabalhadas. A implementação
deve seguir as seguintes restrições:
1. Em um painel superior, utilizando o ConstraintLayout, apresente as informações:
• Matricula do funcionário;
• Nome completo;
• Lotação (Departamento);
• Função (Cargo)
2. No painel inferior utilize o LinearLayout para incluir dinamicamente um campo para
registro do trabalho realizado para cada hora útil do dia, iniciando às 08:00h e encerrando
às 17h. Exemplo:
• Se o usuário acessar às 08:30h, não deve aparecer nenhum campo.
• Se o usuário acessar às 09:00h, deve aparecer apenas um campo.
• Se o usuário acessar às 11:00h, deve aparecer 3 campos.
• Se o usuário acessar às 13:00, deve aparecer apenas 4 campos, pois das 12h às 13h
será horário de almoço.
• Se o usuário acessar após às 17h, haverão 8 campos disponíveis, que ficarão
disponíveis até às 23:59:59"