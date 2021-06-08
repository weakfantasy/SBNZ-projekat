insert into users (type, email, password, verified) values ('admin', 'admin@gmail.com','$2a$10$RVzuprKddsjdq6P8QWmqF.sCj2uYPIUlbFVB.b7tJ9RdFNOOBNoXO' ,true);
insert into anxiety_disorder (name) values ('GAD');
insert into anxiety_disorder (name) values ('SAD');
insert into anxiety_disorder (name) values ('OCD');
insert into anxiety_disorder (name) values ('PTSD');
insert into anxiety_disorder (name) values ('PD');
insert into anxiety_disorder (name) values ('Phobia');

insert into predominant_disorder (id, predominant_symptoms) values (1 , 'Restlesness');
insert into predominant_disorder (id, predominant_symptoms) values (1 , 'Irritability');
insert into predominant_disorder (id, predominant_symptoms) values (1 , 'ConstantWorrying');
insert into predominant_disorder (id, predominant_symptoms) values (1 , 'FeelingsOfDread');
insert into predominant_disorder (id, predominant_symptoms) values (1 , 'IntrusiveThoughts');
--
insert into predominant_disorder (id, predominant_symptoms) values (2 , 'FearOfCriticism');
insert into predominant_disorder (id, predominant_symptoms) values (2 , 'FearOfAttention');
insert into predominant_disorder (id, predominant_symptoms) values (2 , 'FearOfJudgement');
insert into predominant_disorder (id, predominant_symptoms) values (2 , 'FearOfEmbarassement');
insert into predominant_disorder (id, predominant_symptoms) values (2 , 'IntrusiveThoughts');

insert into predominant_disorder (id, predominant_symptoms) values (3 , 'FearOfContamination');
insert into predominant_disorder (id, predominant_symptoms) values (3 , 'ExcessiveConcernMortality');
insert into predominant_disorder (id, predominant_symptoms) values (3 , 'FeelingsOfDread');
insert into predominant_disorder (id, predominant_symptoms) values (3 , 'FearOfDeath');
insert into predominant_disorder (id, predominant_symptoms) values (3 , 'ExcessiveConcernMortality');
insert into predominant_disorder (id, predominant_symptoms) values (3 , 'IntrusiveThoughts');

insert into predominant_disorder (id, predominant_symptoms) values (4 , 'UpsettingDreams');
insert into predominant_disorder (id, predominant_symptoms) values (4 , 'EmotionalDistress');
insert into predominant_disorder (id, predominant_symptoms) values (4 , 'UnwantedMemories');
insert into predominant_disorder (id, predominant_symptoms) values (4 , 'IntrusiveThoughts');
insert into predominant_disorder (id, predominant_symptoms) values (4 , 'RelivingOfPast');

insert into predominant_disorder (id, predominant_symptoms) values (5 , 'SenseOfDoom');
insert into predominant_disorder (id, predominant_symptoms) values (5 , 'FearOfDeath');
insert into predominant_disorder (id, predominant_symptoms) values (5 , 'PanicAttacks');
insert into predominant_disorder (id, predominant_symptoms) values (5 , 'IntrusiveThoughts');

insert into predominant_disorder (id, predominant_symptoms) values (6 , 'FearOfDeath');
insert into predominant_disorder (id, predominant_symptoms) values (6 , 'FearOfFainting');
insert into predominant_disorder (id, predominant_symptoms) values (6 , 'FearOfLosingControl');
insert into predominant_disorder (id, predominant_symptoms) values (6 , 'FearOfContamination');


insert into depression (name, depression_type) values ('Depression caused by GAD', 'DepressionGAD');
insert into depression (name, depression_type) values ('Depression caused by SAD', 'DepressionSAD');
insert into depression (name, depression_type) values ('Depression caused by OCD', 'DepressionOCD');
insert into depression (name, depression_type) values ('Depression caused by PTSD', 'DepressionPTSD');
insert into depression (name, depression_type) values ('Depression caused by PD', 'DepressionPD');
insert into depression (name, depression_type) values ('Depression caused by Phobia', 'DepressionPh');


insert into depression_symptoms(id, depression_symptoms) values (1, 'hopelessness');
insert into depression_symptoms(id, depression_symptoms) values (1, 'suicidalThougths');
insert into depression_symptoms(id, depression_symptoms) values (2, 'hopelessness');
insert into depression_symptoms(id, depression_symptoms) values (2, 'suicidalThougths');
insert into depression_symptoms(id, depression_symptoms) values (3, 'hopelessness');
insert into depression_symptoms(id, depression_symptoms) values (3, 'suicidalThougths');
insert into depression_symptoms(id, depression_symptoms) values (4, 'hopelessness');
insert into depression_symptoms(id, depression_symptoms) values (4, 'suicidalThougths');
insert into depression_symptoms(id, depression_symptoms) values (5, 'hopelessness');
insert into depression_symptoms(id, depression_symptoms) values (5, 'suicidalThougths');
insert into depression_symptoms(id, depression_symptoms) values (6, 'hopelessness');
insert into depression_symptoms(id, depression_symptoms) values (6, 'suicidalThougths');


insert into therapy(name, therapy_type, description) values ('Cognitive Processing Therapy', 'cognitive', 'opis');
insert into diagnosis(disorder_id, therapy_id) values (4 ,1);
