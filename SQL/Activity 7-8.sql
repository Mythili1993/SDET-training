use sdet4_Mythili;

/*Activity7*/
select SUM(purchase_amount) AS "Total" from orders;
select AVG(purchase_amount) AS "Average" from orders;
select MAX(purchase_amount) AS "Max value" from orders;
select MIN(purchase_amount) AS "Min value" from orders;
select COUNT(distinct salesman_id) AS "Count" from orders;

/*Activity8*/
SELECT customer_id, MAX(purchase_amount) AS "Max Amount" FROM orders GROUP BY customer_id;
SELECT salesman_id, order_date, MAX(purchase_amount) AS "Max Amount" FROM orders WHERE order_date='2012-08-17' GROUP BY salesman_id, order_date;
SELECT customer_id, order_date, MAX(purchase_amount) AS "Max Amount" FROM orders GROUP BY customer_id, order_date HAVING MAX(purchase_amount) IN(2030, 3450, 5760, 6000);


