package assignments;

public class _175_MethodsWithString10_lame_db {
	public static String lameDb(String db, String op, String id, String data) {

		switch (op) {
		case "add":
			if(data.length()==0) {
				return db;
			}else {
				return db + "#" + id + data;
			}
			
		case "edit":
			for (int i = 0; i < db.length(); i++) {
				if (db.substring(i, i + 1).equals(id)) {
					String delet = "";
					if (db.lastIndexOf("#") < i) {
						delet = db.substring(i);
					} else {
						delet = db.substring(i, db.indexOf("#", i + 1));
					}
					String add = id + data;
					return db.replace(delet, add);
				}
			}
		case "delete":
			for (int i = 0; i < db.length(); i++) {
				if (db.substring(i, i + 1).equals(id)) {
					String delet = "";
					if (db.lastIndexOf("#") < i) {
						delet = db.substring(i-1);
					} else {
						delet = db.substring(i, db.indexOf("#", i + 1));
					}
					return db.replace(delet, "");
				}
			}
		default:
			return db;

		}

	}// end lameDb

	public static void main(String[] args) {

		System.out.print(lameDb("1etsy#2wooden#3spoon", "add", "4", "aaa") + "\n");

		System.out.print(lameDb("1tst#2bla#3foo", "edit", "3", "bbb") + "\n");

		System.out.print(lameDb("1tst#2bla#3foo", "delete", "3", "") + "\n");

		System.out.print(lameDb("1tst#2bla#3foo", "none", "1", "") + "\n");

	}

}
