#Julia Vega Plotting

#Pkg.add("Vega")
using Vega
stock = ["chairs", "tables", "desks", "rugs", "lamps"];
quantity = [15, 10, 10, 5, 20];
piechart(x = stock, y = quantity)
