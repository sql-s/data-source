select cust.name, cust.surname, o.product_name
from customers cust
inner join orders o on cust.name ILIKE :name;