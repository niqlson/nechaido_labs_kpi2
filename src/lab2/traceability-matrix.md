# Матриця трасування вимог

| ID вимоги | Use Cases | Тип зв'язку | Нефункціональні вимоги |
|-----------|-----------|-------------|------------------------|
| **FR1** | Register Account | Прямий | NFR1 (Захист автентифікації) |
| **FR2** | Login | Прямий | NFR1 (Захист автентифікації) |
| **FR3** | Logout | Прямий | - |
| **FR4** | Guest, Customer, Admin | Непрямий | NFR3 (Контроль доступу) |
| **FR5** | Browse Products | Прямий | - |
| **FR6** | Search Products | Прямий | - |
| **FR7** | View Product Details | Прямий | - |
| **FR8** | Browse Products, Search Products | Непрямий | - |
| **FR9** | Add to Cart | Прямий | NFR5 (Консистентність даних) |
| **FR10** | Change Item Quantity | Прямий | NFR5 (Консистентність даних) |
| **FR11** | Remove from Cart | Прямий | NFR5 (Консистентність даних) |
| **FR12** | Manage Cart | Непрямий | NFR5 (Консистентність даних) |
| **FR13** | Checkout | Прямий | NFR4, NFR6 (Надійність, Зручність) |
| **FR14** | Enter Shipping Info | Прямий | NFR6 (Зручність) |
| **FR15** | Select Payment Method | Прямий | NFR6 (Зручність) |
| **FR16** | Apply Discount Code | Прямий | NFR6 (Зручність) |
| **FR17** | Confirm Payment | Прямий | NFR2 (Безпека транзакцій) |
| **FR18** | Place Order | Прямий | NFR4 (Цілісність транзакцій) |
| **FR19** | Track Order | Прямий | - |
| **FR20** | Track Order, View Orders | Непрямий | - |
| **FR21** | View Orders | Прямий | - |
| **FR22** | Write Review | Прямий | NFR7 (Зручність управління) |
| **FR23** | Edit Review | Прямий | NFR7 (Зручність управління) |
| **FR24** | Delete Review | Прямий | NFR7 (Зручність управління) |
| **FR25** | Make Reservation | Прямий | NFR7 (Зручність управління) |
| **FR26** | Cancel Reservation | Прямий | NFR7 (Зручність управління) |
| **FR27** | View Reservation Status | Прямий | NFR7 (Зручність управління) |
| **FR28** | Pick Up Reserved Products | Прямий | NFR7 (Зручність управління) |
| **FR29** | Approve Reservation, Reject Reservation | Прямий | NFR3 (Контроль доступу) |
| **FR30** | Create Product, Update Product, Delete Product | Прямий | NFR3 (Контроль доступу) |
| **FR31** | Update Stock | Прямий | NFR3 (Контроль доступу) |
| **FR32** | Create Discount, Update Discount, Deactivate Discount | Прямий | NFR3 (Контроль доступу) |
| **FR33** | Admin Reservations | Непрямий | NFR3 (Контроль доступу) |

## Use Cases без прямих функціональних вимог

### Допоміжні Use Cases
- **View Review Details** - допоміжний UC для редагування/видалення відгуків
- **View Order Details** - допоміжний UC для відстеження замовлень

### Абстрактні (батьківські) Use Cases для групування
- **Manage Reviews** - групує функції управління відгуками (Write Review, Edit Review, Delete Review)
- **Manage Cart** - групує операції з кошиком (Add to Cart, Remove from Cart, Change Item Quantity)
- **Manage Products** - групує адміністративні функції товарів (Create Product, Update Product, Delete Product, Update Stock)
- **Manage Discounts** - групує управління знижками (Create Discount, Update Discount, Deactivate Discount)
- **Customer Reservations** - групує клієнтські операції бронювання
- **Admin Reservations** - групує адміністративні операції бронювання

### Обґрунтування абстрактних Use Cases
Ці Use Cases не мають прямих функціональних вимог, оскільки їх основна функція - **структурна та організаційна**:
- Групування логічно пов'язаних сценаріїв
- Спрощення діаграми (менше зв'язків від акторів)
- Відображення загальних бізнес-концепцій
- Покращення читабельності та обслуговування діаграми

**Функціональні вимоги реалізуються через дочірні Use Cases**, що наслідують від абстрактних.

## Абстрактні Use Cases та їх призначення
| Абстрактний UC | Дочірні UC | Покриті FR | Призначення |
|----------------|------------|------------|-------------|
| **Manage Cart** | Add to Cart, Remove from Cart, Change Item Quantity | FR9-FR12 | Групування операцій кошика |
| **Manage Products** | Create Product, Update Product, Delete Product, Update Stock | FR30-FR31 | Групування управління товарами |
| **Manage Discounts** | Create Discount, Update Discount, Deactivate Discount | FR32 | Групування управління знижками |
| **Manage Reviews** | Write Review, Edit Review, Delete Review | FR22-FR24 | Групування операцій відгуків |
| **Customer Reservations** | Make Reservation, Cancel Reservation, View Reservation Status, Pick Up Reserved Products | FR25-FR28 | Групування клієнтських бронювань |
| **Admin Reservations** | Approve Reservation, Reject Reservation, View Reservation Status | FR29, FR33 | Групування адміністративних бронювань |

## Аналіз покриття
- **100% функціональних вимог** покрито Use Cases
- **Всі критичні нефункціональні вимоги** мають відповідні Use Cases
- **Немає вимог без покриття**
- **Мінімальна кількість допоміжних UC** без прямих вимог

## Ключові нефункціональні покриття
- **Безпека**: NFR1, NFR2, NFR3 покривають критичні аспекти безпеки
- **Надійність**: NFR4, NFR5 забезпечують стабільність роботи
- **Зручність**: NFR6, NFR7 покращують користувацький досвід
