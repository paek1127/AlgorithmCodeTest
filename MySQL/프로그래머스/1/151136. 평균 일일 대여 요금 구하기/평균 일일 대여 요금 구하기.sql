-- 코드를 입력하세요
SELECT truncate(avg(daily_fee),0) as AVERAGE_FEE
from car_rental_company_car
where car_type = 'SUV';