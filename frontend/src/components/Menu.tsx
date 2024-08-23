import { Container, Nav, Navbar } from "react-bootstrap";

const Menu = () => {
    return (
        <Navbar bg="dark" variant="dark" expand="lg" className="mb-1">
            <Container>
                <Navbar.Brand href="#home">Planos</Navbar.Brand>
                <Navbar.Toggle aria-controls="basic-navbar-nav"></Navbar.Toggle>
                <Navbar.Collapse id="basic-navbar-nav">
                    <Nav>
                        <Nav.Link href="#home">Home</Nav.Link>
                    </Nav>
                </Navbar.Collapse>
            </Container>
        </Navbar>
    )
}
export default Menu;