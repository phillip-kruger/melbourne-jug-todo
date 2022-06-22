-- Load some test data

insert into TODO (id, title, description, isdone) values (nextval('hibernate_sequence'), 'Prepare Demo', 'Prepare Quarkus Demo for Melbourne JUG', false);