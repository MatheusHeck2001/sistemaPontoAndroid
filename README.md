*Atividade para treinar uso de layouts*

Especificação:
"Em um projeto Android, utilizando os layouts para organização dos componentes visuais da
interface de usuário implemente uma tela para lançamento de horas trabalhadas. A implementação
deve seguir as seguintes restrições:
1. Em um painel superior, utilizando o ConstraintLayout, apresente as informações:</br>
• Matricula do funcionário;</br>
• Nome completo;</br>
• Lotação (Departamento);</br>
• Função (Cargo)</br>
2. No painel inferior utilize o LinearLayout para incluir dinamicamente um campo para
registro do trabalho realizado para cada hora útil do dia, iniciando às 08:00h e encerrando
às 17h. Exemplo:</br>
• Se o usuário acessar às 08:30h, não deve aparecer nenhum campo.</br>
• Se o usuário acessar às 09:00h, deve aparecer apenas um campo.</br>
• Se o usuário acessar às 11:00h, deve aparecer 3 campos.</br>
• Se o usuário acessar às 13:00, deve aparecer apenas 4 campos, pois das 12h às 13h
será horário de almoço.</br>
• Se o usuário acessar após às 17h, haverão 8 campos disponíveis, que ficarão
disponíveis até às 23:59:59".</br>

[Exemplo de execução do projeto com hora setada em 23:00](https://github.com/MatheusHeck2001/sistemaPontoAndroid/blob/main/screenAtPonto.png)</br>

[Arquivo java com a lógica do projeto](https://github.com/MatheusHeck2001/sistemaPontoAndroid/blob/main/app/src/main/java/com/example/atividade5/MainActivity.java)</br>
[Arquivo com o código XML da Activity](https://github.com/MatheusHeck2001/sistemaPontoAndroid/blob/main/app/src/main/res/layout/activity_main.xml)</br>
[Arquivo com as strings utilizadas no projeto](https://github.com/MatheusHeck2001/sistemaPontoAndroid/blob/main/app/src/main/res/values/strings.xml)</br>
