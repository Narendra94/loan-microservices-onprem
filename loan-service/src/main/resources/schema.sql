Create table if not exists loans (
	id serial primary key,
	customer_id BIGINT,
	amount decimal(10,2),
	type varchar(50),
	status varchar(20)
);