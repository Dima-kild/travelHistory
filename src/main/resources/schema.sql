use travelhistoryhelper;
drop table if exists travelhistory;
create table travelhistory
(
    id             integer primary key not null auto_increment,
    country_name    varchar(24)         not null unique,
    current_weather varchar(20),
    year_of_journey  integer,
    info           varchar(512),
    user_name       varchar(25)
);