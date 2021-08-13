Создать REST сервис для хранения истории путешествий.
Сервис должен предоставлять функционал для сохранения, обновления, удаления и чтения записей о путешествии.
Каждая запись о путешествии содержит следующие поля:
• Страна (обязательное поле)
• Текущая погода (Только для режима чтения. Для получения погоды воспользуйтесь любым бесплатным API.)
• Год путешествия
• Краткое описание
• Пользователь (обязательное поле)
Для вывода погоды воспользуйтесь любым бесплатным API.
Результат работы это рабочий код, с валидацией полей. Большим плюсом будет наличие unit и integration тестов.
Код нужно залить на GitHub (https://github.com/). Полезная информация для запуска приложений должны быть в файле read.me. Использовать SpringBoot, Maven. Для хранения данных использовать In-Memory базу данных.

Запуск

-создать Schema "travelhistoryhelper";
Указать информацию о БД в application.properties:
-spring.datasource.url-;
-spring.datasource.username-;
-spring.datasource.password-;  
-server.port= (в моем приложение 8095), вы можете выбрать свой;
Вся информация в application.properties.

REST web-service:

GET http://localhost:8095/api/notes
Accept: application/json

###

POST http://localhost:8095/api/notes
Content-Type: application/json

{
"countryName": "Норвегия",
"yearOfJourney": "2019",
"info": "Прекрасная страна, но холодновато. А еще можно покататься в горах",
"userName": "Дима"
}

###

PUT http://localhost:8095/api/notes/{id}
Content-Type: application/json


###

DELETE http://localhost:8095/api/cities/{id}
