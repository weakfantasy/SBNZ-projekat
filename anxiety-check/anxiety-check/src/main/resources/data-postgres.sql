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


insert into therapy(name, description) values ('Cognitive Behavioral Therapy', 'Cognitive Behavioral Therapy as a treatment for GAD has been established as an excellent way to change pathological worries into normal worries. The excessive, uncontrollable worry that is the hallmark of GAD is thought to be maintained through maladaptive thinking about the utility of worrying, a tendency to repeat worries instead of problem-solving, difficulties relaxing, and unhealthy behaviors, including attempted avoidance of negative thoughts and images, as well as situations that might provoke worry. The cognitive therapy techniques focus on modifying the catastrophic thinking patterns and beliefs that worrying is serving a useful function (termed cognitive restructuring). The behavioral techniques include relaxation training, scheduling specific ‘worry time’ as well as planning pleasurable activities, and controlled exposure to thoughts and situations that are being avoided. The purpose of these exposures is to help you learn that your feared outcomes do not come true, and to experience a reduction in anxiety over time.');

insert into therapy(name, description) values ('Cognitive Processing Therapy', 'Cognitive processing therapy (CPT) is a specific type of cognitive behavioral therapy that has been effective in reducing symptoms of PTSD that have developed after experiencing a variety of traumatic events including child abuse, combat, rape and natural disasters. Trauma can change the way you think about yourself and the world. You may believe you are to blame for what happened or that the world is a dangerous place. These kinds of thoughts keep you stuck in your PTSD and cause you to miss out on things you used to enjoy. CPT teaches you a new way to handle these upsetting thoughts. In CPT, you will learn skills that can help you decide whether there are more helpful ways to think about your trauma. You will learn how to examine whether the facts support your thought or do not support your thought. And ultimately, you can decide whether or not it makes sense to take a new perspective.');

insert into therapy(name, description) values ('Psychotherapy and Prescription medication', 'With both conditions, it’s important to seek treatment as soon as possible. Letting either condition linger — and likely worsen — for months or even years can do harm to both your physical and mental health. Psychotherapy, or talk therapy, is a way to help people with a broad variety of mental illnesses and emotional difficulties. Psychotherapy can help eliminate or control troubling symptoms so a person can function better and can increase well-being and healing. These include antidepressants, anti-anxiety medicines, and sleep aids. SEEK IMEDIATE HELP.');
insert into therapy(name, description) values ('Psychotherapy and Prescription medication', 'It is common to have depression that is triggered by an anxiety disorder. It is very importan to address the depression first, otherwise with preferential therepies for anxiety disorder, you might not make any progress. Psychotherapy can help eliminate or control troubling symptoms so a person can function better and can increase well-being and healing. These include antidepressants, anti-anxiety medicines, and sleep aids. SEEK IMEDIATE HELP.');

insert into therapy(name, description) values ('Panic-Focused Psychodynamic Psychotherapy', 'Panic-focused psychodynamic psychotherapy (PFPP) is therapeutic method used in the treatment of panic disorder. This form of psychotherapy aims to uncover past experiences and emotional conflicts that may have influenced your development of panic and anxiety.
PFPP helps you recognize unconscious conflicts, particularly around anger, helping you to resolve these conflicts in less frightening and more adaptive ways.');

insert into therapy(name, description) values ('Cognitive Behavioral Therapy', ' Through Cognitive Behavioral Therapy (CBT) for social anxiety, people learn different ways of reacting to thoughts and feelings, and they learn to engage in different behaviors that result in decreased fear. CBT also helps people learn and practice social skills when there is a deficit. Unlike traditional talk-therapy, CBT for social anxiety is an active, brief treatment, involving use of skills training and behavioral homework assignments. Through learning and practice of CBT skills, people learn to become their own therapists, which is why CBT for social anxiety lasts signficantly less time than traditional therapy.');

insert into therapy(name, description) values ('Cognitive Behavioral Therapy', 'Obsessive-compulsive disorder treatment may not result in a cure, but it can help bring symptoms under control so that they do not rule your daily life. Depending on the severity of OCD, some people may need long-term, ongoing or more intensive treatment. Cognitive behavioral therapy (CBT), a type of psychotherapy, is effective for many people with OCD. Exposure and response prevention (ERP), a component of CBT therapy, involves gradually exposing you to a feared object or obsession, such as dirt, and having you learn ways to resist the urge to do your compulsive rituals. ERP takes effort and practice, but you may enjoy a better quality of life once you learn to manage your obsessions and compulsions.');

insert into therapy(name, description) values ('Exposure Therapy', 'Treatment process that is often used to treat simple phobias involves gradual exposure to your fear, so you feel less anxious about it. This is known as desensitisation or exposure therapy. Exposure therapy works by gradually increasing the level of exposure to your fear, which allows you to gain control over your phobia. As the treatment progresses, you should begin to feel less anxious about your phobia.');


insert into diagnosis(name, disorder_id, therapy_id, anxiety) values ('Generalized anxiety disorder',1 ,1, true);
insert into diagnosis(name, disorder_id, therapy_id, anxiety, depression_id) values ('Generalized anxiety disorder that caused depression',1 ,4, true, 1);

insert into diagnosis(name, disorder_id, therapy_id, anxiety) values ('Posttraumatic stress disorder',4 ,2, true);
insert into diagnosis(name, disorder_id, therapy_id, anxiety, depression_id) values ('Posttraumatic stress disorder that caused depression',4 ,3, true, 4);

insert into diagnosis(name, disorder_id, therapy_id, anxiety) values ('Panic disorder',5 ,5, true);
insert into diagnosis(name, disorder_id, therapy_id, anxiety, depression_id) values ('Panic disorder that caused depression',5 ,4, true, 5);

insert into diagnosis(name, disorder_id, therapy_id, anxiety) values ('Social anxiety disorder',2 ,6, true);
insert into diagnosis(name, disorder_id, therapy_id, anxiety, depression_id) values ('Social anxiety disorder that caused depression',6 ,4, true, 2);

insert into diagnosis(name, disorder_id, therapy_id, anxiety) values ('Obsessive-compulsive disorder',3 ,7, true);
insert into diagnosis(name, disorder_id, therapy_id, anxiety, depression_id) values ('Obsessive-compulsive disorder that caused depression',3 ,4, true, 2);

insert into diagnosis(name, disorder_id, therapy_id, anxiety) values ('Phobia',6 ,8, true);
insert into diagnosis(name, disorder_id, therapy_id, anxiety, depression_id) values ('Phobia',6 ,4, true, 2);

