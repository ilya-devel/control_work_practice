# control_work_practice

Итоговая контрольная работа по блоку специализация

Задание

1. Используя команду cat в терминале операционной системы Linux, создать два файла Домашние животные (заполнив файл собаками, кошками, хомяками) и Вьючные животными заполнив файл Лошадьми, верблюдами и ослы), а затем объединить их. Просмотреть содержимое созданного файла. Переименовать файл, дав ему новое имя (Друзья человека).
```
ilya@ilya-ROG-Strix-G513QY-G513QY:~/control_work_practice$ cat > pets
dog
cat
hamster

ilya@ilya-ROG-Strix-G513QY-G513QY:~/control_work_practice$ cat > pack_animal
cow
horse
donkey

ilya@ilya-ROG-Strix-G513QY-G513QY:~/control_work_practice$ cat pets pack_animal 
dog
cat
hamster
cow
horse
donkey

ilya@ilya-ROG-Strix-G513QY-G513QY:~/control_work_practice$ cat pets pack_animal > all_animals

ilya@ilya-ROG-Strix-G513QY-G513QY:~/control_work_practice$ cat all_animals 
dog
cat
hamster
cow
horse
donkey

ilya@ilya-ROG-Strix-G513QY-G513QY:~/control_work_practice$ mv all_animals mans_friends

```
2. Создать директорию, переместить файл туда.
```
ilya@ilya-ROG-Strix-G513QY-G513QY:~/control_work_practice$ mkdir tmpDir && mv mans_friends ./tmpDir
```
3. Подключить дополнительный репозиторий MySQL. Установить любой пакет из этого репозитория.
```
lesson@serverub:~$ wget https://repo.mysql.com//mysql-apt-config_0.8.25-1_all.deb
--2023-06-07 12:13:40--  https://repo.mysql.com//mysql-apt-config_0.8.25-1_all.deb
Resolving repo.mysql.com (repo.mysql.com)... 104.73.92.227
Connecting to repo.mysql.com (repo.mysql.com)|104.73.92.227|:443... connected.
HTTP request sent, awaiting response... 200 OK
Length: 18120 (18K) [application/x-debian-package]
Saving to: ‘mysql-apt-config_0.8.25-1_all.deb’

mysql-apt-config_0.8.25-1_all.deb                                    100%[====================================================================================================================================================================>]  17.70K  --.-KB/s    in 0s      

2023-06-07 12:13:40 (159 MB/s) - ‘mysql-apt-config_0.8.25-1_all.deb’ saved [18120/18120]

lesson@serverub:~$ sudo dpkg -i mysql-apt-config_0.8.25-1_all.deb 
[sudo] password for lesson: 
Selecting previously unselected package mysql-apt-config.
(Reading database ... 111014 files and directories currently installed.)
Preparing to unpack mysql-apt-config_0.8.25-1_all.deb ...
Unpacking mysql-apt-config (0.8.25-1) ...
Setting up mysql-apt-config (0.8.25-1) ...

lesson@serverub:~$ sudo apt install mysql-client
```
4. Установить и удалить deb-пакет с помощью dpkg.
```
sudo dpkg -i <deb-package_name>

sudo dpkg -r <deb-package_name> 
или
sudo dpkg -P <deb-package_name> # полное удаление
```
5. Выложить историю команд в терминале ubuntu
```
lesson@serverub:~$ history | tail
 1146  sudo systemctl start mysql
 1147  sudo systemctl start mysql-server
 1148  mysql --version
 1149  exit
 1150  sudo apt purge mysql-client
 1151  sudo shutdown -P now
 1152  sudo dpkg --help
 1153  history 
 1154  sudo history 
 1155  history | tail

```
6. Нарисовать диаграмму, в которой есть класс родительский класс, домашние животные и вьючные животные, в составы которых в случае домашних животных войдут классы: собаки, кошки, хомяки, а в класс вьючные животные войдут: Лошади, верблюды и ослы).
7. В подключенном MySQL репозитории создать базу данных “Друзья человека”
8. Создать таблицы с иерархией из диаграммы в БД
9. Заполнить низкоуровневые таблицы именами(животных), командами которые они выполняют и датами рождения
10. Удалив из таблицы верблюдов, т.к. верблюдов решили перевезти в другой питомник на зимовку. Объединить таблицы лошади, и ослы в одну таблицу.
11. Создать новую таблицу “молодые животные” в которую попадут все животные старше 1 года, но младше 3 лет и в отдельном столбце с точностью до месяца подсчитать возраст животных в новой таблице
12. Объединить все таблицы в одну, при этом сохраняя поля, указывающие на прошлую принадлежность к старым таблицам.
13. Создать класс с Инкапсуляцией методов и наследованием по диаграмме.
14. Написать программу, имитирующую работу реестра домашних животных. В программе должен быть реализован следующий функционал:
    1. Завести новое животное
    2. определять животное в правильный класс
    3. увидеть список команд, которое выполняет животное
    4. обучить животное новым командам
    5. Реализовать навигацию по меню
15. Создайте класс Счетчик, у которого есть метод add(), увеличивающий̆ значение внутренней̆ int переменной̆ на 1 при нажатие “Завести новое животное” Сделайте так, чтобы с объектом такого типа можно было работать в блоке try-with-resources. Нужно бросить исключение, если работа с объектом типа счетчик была не в ресурсном try и/или ресурс остался открыт. Значение считать в ресурсе try, если при заведения животного заполнены все поля.