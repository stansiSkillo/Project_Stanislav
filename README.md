Файловете са в Test/Java/Final/Pages/Tests 

Login test - целта е да се провери дали работи правилно линка Register

Register test - целта е да се въведат валидни username, email и парола, но паролата за потвърждение да е различна, т.е да се види дали правилно реагира софтуера на 
грешна парола, като се очаква да бъде отказана регистрация в този случай. Трябва да се има предвид че, за да мине тестът успешно, в Data provider следва да 
се зададат нови username и имейл, защото тези вече са пробвани при тест и програмата ще подаде друго съобщение. 

Download test - идеята е да се отвори Home page, да се кликне с десен клавиш на мишката на последния пост и да се свали картинката в директория по подразбиране на
компютъра на потребителя. При този тест има някои особености, които следват да бъдат отбелязани. Използвал съм клас Robot и Actions, които не сме учили, но след търсене 
в интернет те бяха единственият вариант, чрез който да успея да подкарам теста. На уеб елемента Image, който е картинката от поста, трябва да се подаде сорса 
на снимката от последния пост (най-новия), защото не можах да намеря работещ локатор за снимките на по-старите постове. Тестът трябва да се пусне в Debug mode, 
като паузата да се сложи преди Robot да натисне клавиша Save as (т.е на този ред: robot.keyPress(KeyEvent.VK_ENTER);). След това вече може да се продължи. В директорията 
по подразбиране на потребителя ще се свали файл с разширение .tmp, който може да се отвори с Ifran View например и ще се обърне автоматично в jpeg, като това вече ще бъде 
снимката от поста. Ако тестът не се пусне в Debug mode, то той ще мине успешно, но по не знам каква причина картинката не се сваля. 

Тестовете имат Screenshot опция, както и Report, който трябва да се пусне ръчно с Listeners. Направен е и TestNG.xml файл, чрез plug in за IntelliJ. 
