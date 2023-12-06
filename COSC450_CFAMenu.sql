create database CFAMenu;
use CFAMenu;
create table Beverages (
	Size	varchar(7)	not null,
    Drink	varchar(8)	not null,
    Price	double		not null,
    primary key (Price) );
insert into Beverages (BevID,Size,Drink,Price) values 
(1,'Small','Tea',1.79),
(2,'Medium','Tea',2.15),
(3,'Large','Tea',2.55),
(4,'Gallon','Tea',6.25),
(5,'Small','Lemonade',2.15),
(6,'Medium','Lemonade',2.49),
(7,'Large','Lemonade',2.95),
(8,'Gallon','Lemonade',12.00),
(9,'Small','Sunjoy',2.15),
(10,'Medium','Sunjoy',2.49),
(11,'Large','Sunjoy',2.95),
(12,'Small','Soda',1.79),
(13,'Medium','Soda',2.15),
(14,'Large','Soda',2.55);
create table Breakfast (
	BreakID	int	not null,
    Type	varchar(10)	not null,
    BName	varchar(30)	not null,
    Price	double	not null,
    primary key (BreakID) );
insert into Breakfast (BreakID,Type,BName,Price) values
	(1,'Biscuit','Chicken',3.49),
    (2,'Biscuit','Chicken Egg Cheese',4.39),
    (3,'Biscuit','Bacon Egg Cheese',3.79),
    (4,'Biscuit','Sausage Egg Cheese',3.79),
    (5,'Biscuit','Buttered',1.49),
    (6,'Mini','4ct',4.49),
    (7,'Mini','10ct',11.19),
    (8,'Muffin','Egg White Grill',4.85),
    (9,'Muffin','Chicken Egg Cheese',4.59),
    (10,'Muffin','Bacon Egg Cheese',3.99),
    (11,'Muffin','Sausage Egg Cheese',3.99),
    (12,'Muffin','English',1.69),
    (13,'Bowl','Hash Brown Scramble',4.75),
    (14,'Burrito','Hash Brown Scramble',4.75),
    (15,'Filet','Breakfast',2.00);
create table Entree (
	EntID	int	not null,
    Type	varchar(15)	not null,
    EName	varchar(20)	not null,
    Price	double	not null,
    primary key (EntID) );
insert into Entree (EntID,Type,EName,Price) values
	(1,'Sandwich','CFA',4.75),
    (2,'Sandwich','Spicy',5.15),
    (3,'Sandwich','CFA Deluxe',5.45),
    (4,'Sandwich','Spicy Deluxe',5.85),
    (5,'Sandwich','Grilled',6.29),
    (6,'Sandwich','Grilled Club',7.99),
    (7,'Nugget','5ct',3.00),
    (8,'Nugget','8ct',4.75),
    (9,'Nugget','12ct',6.65),
    (10,'Nugget','30ct',16.59),
    (11,'Nugget','5ct Grilled',3.50),
    (12,'Nugget','8ct Grilled',5.59),
    (13,'Nugget','12ct Grilled',7.99),
    (14,'Strip','2ct',3.39),
    (15,'Strip','3ct',4.99),
    (16,'Strip','4ct',6.39),
    (17,'Wrap','Grilled',7.59),
    (18,'Filet','Grilled',5.35),
    (19,'Filet','CFA',4.50),
    (20,'Filet','Spicy',4.90);
create table Salads (
	SalID	int	not null,
    SalName	varchar(45)	not null,
    Price	double	not null,
    primary key (SalID) );
insert into Salads (SalID,SalName,Price) values
	(1,'Cobb Salad',9.39),
    (2,'Market Salad',9.59),
    (3,'Spicy Southwest Salad',9.59);
create table Sides (
	SideID	int	not null,
    Size	varchar(10),
    SName	varchar(25)	not null,
    Price	double	not null,
    primary key (SideID) );
insert into Sides (SideID,Size,SName,Price) values
	(1,'Small','Fry',2.09),
    (2,'Medium','Fry',2.35),
    (3,'Large','Fry',2.75),
    (4,'Small','Fruit Cup',2.99),
    (5,'Medium','Fruit Cup',3.95),
    (6,null,'Side Salad',3.95),
    (7,'Small','Mac and Cheese',3.15),
    (8,'Medium','Mac and Cheese',3.95),
    (9,'Medium','Chicken Noodle Soup',3.75),
    (10,'Large','Chicken Noodle Soup',5.69),
    (11,'Medium','Tortilla Soup',5.19),
    (12,'Large','Tortilla Soup',7.95),
    (13,null,'Kale Crunch Salad',2.35),
    (14,null,'Cookie Parfait',4.65),
    (15,null,'Granola Parfait',4.65),
    (16,null,'Chips',1.99),
    (17,null,'Apple Sauce',2.29);
create table Treats (
	TID	int	not null,
    TName	varchar(20)	not null,
    Price	double	not null,
    primary key	(TID) );
insert into Treats (TID,TName,Price) values
	(1,'Frosted Lemonade',4.19),
    (2,'Frosted Coffee',4.19),
    (3,'Cookie',1.55),
    (4,'Brownie',2.15),
    (5,'Milkshake',4.29),
    (6,'Ice Dream Cup',1.35),
    (7,'Ice Dream Cone',1.69);